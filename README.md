# bufbuild
# See `buf.gen.yaml`. [**Managed mode**](https://docs.buf.build/generate/managed-mode) is officially recommended.

To create selfhosting image, you can read this below;

# Selfhosting
bufbuild docker image with protoc

> Buf's image does not contain protoc, and this is on purpose - specific generation plugins you need (including protoc, which contains the plugins for java, cpp, etc) need to be handled by you. We'll be dealing with this ourselves in the future Buf Schema Registry, but for local generation, you are responsible for your own plugin versioning and installation. I'd recommend creating your own Docker image for this.

https://github.com/bufbuild/buf/issues/184

## How to use
First, edit buf yamls (`buf.gen.yaml`, `buf.work.yaml`, `buf.yaml`)

Then
```
docker-compose up
```

Finally, you'll get proto files in `/gen`.

## TODO:
 - Multistaging build
   - use Ubuntu for installing grpcio in pip
 - Use managed plugins
   - later