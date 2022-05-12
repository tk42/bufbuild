FROM bufbuild/buf

## See release page. https://github.com/protocolbuffers/protobuf/releases
ENV PROTOBUF_VERSION=3.20.1

####
## download protoc
## https://github.com/protocolbuffers/protobuf/blob/master/src/README.md
####
WORKDIR /home

RUN set -eux && \
    apk add --update git curl autoconf automake libtool g++ unzip make && \
    curl -L -o /home/protobuf.tar.gz https://github.com/protocolbuffers/protobuf/releases/download/v${PROTOBUF_VERSION}/protobuf-cpp-${PROTOBUF_VERSION}.tar.gz && \
    tar -zxvf protobuf.tar.gz

WORKDIR /home/protobuf-${PROTOBUF_VERSION}

####
## install protoc
####

RUN set -eux && \
    ./autogen.sh && \
    ./configure && \
    make -j 3 && \
    make install

####
## install golang (its dependency is included gcc)
####

RUN apk add --update --no-cache \
    ca-certificates curl go

####
## install golang plugin of protobuf, protoc-gen-go (API v2), protoc-gen-go-grpc (API v2) and protoc-gen-doc
####
ENV GOPATH /go
ENV PATH $GOPATH/bin:$PATH
RUN mkdir -p "$GOPATH/src" "$GOPATH/bin" && chmod -R 777 "$GOPATH"

RUN go install google.golang.org/protobuf/cmd/protoc-gen-go@latest && \
    go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@latest && \
    go install github.com/pseudomuto/protoc-gen-doc/cmd/protoc-gen-doc@latest && \
    go install github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-grpc-gateway@latest && \
    go install github.com/grpc-ecosystem/grpc-gateway/v2/protoc-gen-openapiv2@latest

####
## install typescript plugin of protobuf
####
WORKDIR /home
RUN apk add --update --no-cache \
    npm

# If you use @protobuf-ts, remove this comment out
# RUN npm install @protobuf-ts/plugin
# ENV PATH /home/node_modules/@protobuf-ts/plugin/bin:$PATH

RUN npm install --save \
    ts-protoc-gen \
    google-protobuf \
    @types/google-protobuf \
    @improbable-eng/grpc-web \
    @grpc/grpc-js \
    grpc_tools_node_protoc_ts
ENV PATH /home/node_modules/grpc_tools_node_protoc_ts/bin:$PATH

ENTRYPOINT ["/usr/local/bin/buf"]
