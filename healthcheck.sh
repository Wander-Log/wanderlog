
java -jar wanderlog-api/build/libs/*.jar

for retry_count in \$(seq 10)
do
  if curl -s "http://localhost:8080/health" > /dev/null
  then
      echo "Health check success"
      break
  fi

  if [ $retry_count -eq 10 ]
  then
    echo "Health check failed"
    exit 1
  fi

  echo "The server is not alive yet. Retry health check in 10 seconds..."
  sleep 10
done