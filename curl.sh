while [ true ]
do
    curl -d '{"body": "Hello there !"}' -H "Content-Type: application/json" -X POST http://localhost:8080/api/send
    #sleep 1;
done