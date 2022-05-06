# bufbuild
bufbuild docker image with protoc

> Buf's image does not contain protoc, and this is on purpose - specific generation plugins you need (including protoc, which contains the plugins for java, cpp, etc) need to be handled by you. We'll be dealing with this ourselves in the future Buf Schema Registry, but for local generation, you are responsible for your own plugin versioning and installation. I'd recommend creating your own Docker image for this.

https://github.com/bufbuild/buf/issues/184
