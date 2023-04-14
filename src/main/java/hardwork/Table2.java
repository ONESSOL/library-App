package hardwork;

public class Table2 {

    // ---- 테이블 넣기(생성), 조회, 수정, 삭제
    // ---- CRUD

    // 테이블 넣기
    // insert into fruit (name, price, stocked_date) values ('사과', 1000, '2023-01-01);

    // 데이터 조회
    // select * from fruit; // fruit 테이블의 전체 데이터 조회
    // select name from fruit; // * 대신 필드 가능
    // select name, price from fruit;

    // 필터 걸기 (조건에 맞는 데이터 조회)
    // select * from fruit where name = '사과';
    // select * from fruit where name = '사과' and price <= 2000;
    // select * from fruit where name = '사과' or price = 1000;
    // select * from fruit where price between 1000 and 2000;
    //                              가격이 1000 ~ 2000 인 과일 조회
    // select * from fruit where name in ('사과', '수박');
    //                              이름이 사과 또는 수박인 과일 조회
    // select * from fruit where name not in ('사과');
    //                              이름이 사과가 아닌 과일 조회

    // 데이터 업데이트
    // update fruit set price = 1500 where name = '사과';
    // update fruit set price = 1500; // 조건이 없으면 모든 데이터 수정
    
    // 데이터 삭제
    // delete from fruit where name = '사과';
    // delete from fruit; // 조건이 없으면 모든 데이터 삭제

    // DML (Data Manipulation Language)

}
