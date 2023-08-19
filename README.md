# Demosec

To config datasource, copy `application-secret-example.yml` as `application-secret.yml` and fill information.

Manually create a database BasicDB before start the application, drop the database after stop the application:

```sql
CREATE DATABASE DemosecDB;
DROP DATABASE DemosecDB;
```

Before start the application, execute initdb.sql to create table and insert values:

```bash
mysql -u <username> -p <password> DemosecDB < initdb.sql
```
