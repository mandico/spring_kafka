docker-compose up -d

### Build Image Base
docker build -t kafka-producer:1.0.0 .
docker run --env BOOTSTRAP_SERVER=kafka --env BOOTSTRAP_PORT=29092 kafka-producer:1.0.0

### Build Image Base Alpine
docker build --platform=linux/amd64 -t kafka-producer:1.0.0 .

docker build -t kafka-consumer:1.0.0 .
docker run --env BOOTSTRAP_SERVER=kafka --env BOOTSTRAP_PORT=29092 kafka-consumer:1.0.0