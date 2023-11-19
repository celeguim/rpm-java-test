# Maven RPM build for Java 

## Install RPM build tools
``` 
yum install rpmdevtools
```

## Build RPM
``` 
mvn clean package
```

## Install RPM
``` 
yum install ./target/rpm/rpm-java-test/RPMS/noarch/rpm-java-test-1.0-1.noarch.rpm

```
