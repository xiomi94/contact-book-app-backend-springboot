docker run -d --name contact-book-mysql-container --network contact-book-backend-network ^
-e MYSQL_ROOT_PASSWORD=sasa1234 -v contact-book-data:/var/lib/mysql ^
-v "%cd%\sql\createEmptyDatabase.sql:/docker-entrypoint-initdb.d/init.sql" ^
mysql:8.4.5