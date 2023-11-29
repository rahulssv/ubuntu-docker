
docker build -t container1-image -f Dockerfile1 . ;
docker build -t container2-image -f Dockerfile2 . ;

docker network create "mynetwork" ;

docker run --name container2 --network mynetwork -it container2-image ;

docker run --name container1 --network mynetwork -it container1-image ;


