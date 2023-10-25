
# Kafka-basic-demo

keyword: String Json

- map the localhost to WSL2 IP value which is always changing on machine restart :

```bash
  netsh interface portproxy add v4tov4 listenport=9092 listenaddress=0.0.0.0 connectport=9092 connectaddress=<IP OF YOUR WSL2>
```

- get ip of wsl2 (run on wsl machine):
```bash
ip addr show eth0 | grep -oP '(?<=inet\s)\d+(\.\d+){3}'
```
# Start the ZooKeeper service
```
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```
# Start the Kafka broker service (in new terminal)
```
$ bin/kafka-server-start.sh config/server.properties
```
