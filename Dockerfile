FROM ubuntu:latest
LABEL authors="dat.nguyen"

ENTRYPOINT ["top", "-b"]