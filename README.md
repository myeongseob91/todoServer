# todoServer

docker run -p 5432:5432 -e POSTGRES_PASSWORD=pass -e POSTGRES_USER=user -e POSTGRES_DB=springboot --name postgres_boot -d postgres

docker exec -i -t postgres_boot bash

su - postgres

psql springboot // 안됨
psql -U user springboot //됨

데이터베이스 조회
\list

테이블 조회
\dt

쿼리
SELECT * FROM account;
