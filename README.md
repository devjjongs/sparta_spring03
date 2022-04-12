# sparta_spring03

#[스파르타코딩클럽]웹개발의 봄, Spring - 3주차

1. 서버 완성하기 - Memo API
     - 2주차 때 배운 내용을 바탕으로 CRUD 기능을 가진 Memo API를 만듭니다.
     - 키워드: RestController, Service, Repository, RequestDto


2. HTML, CSS
     - 웹 화면을 구성하는 HTML, CSS에 대해 배워봅니다.


3. Javascript, jQuery
     - 웹 화면을 움직이게 만들어주는 Javascript의 기초를 배웁니다.
     - jQuery 를 이용하여 화면을 숨기고, 나타내는 방법을 익혀봅니다.


4. 클라이언트 완성하기
     - HTML, CSS, Javascript 를 바탕으로 클라이언트를 완성하고, 서버와 연결합니다.
     - 완성된 페이지를 로컬에서 확인합니다.


#[타임라인 API 설계하기(CRUD)]
1. JPA project 서버 구조
   - Controller - Service - Repository 3계층 존재
      - 안에서 바깥으로, 즉 Repository 부터 Service, Controller 방향으로 생성


2. 기능 | Method | URL | Return
   - 메모 | 생성하기 |   POST  | /api/memos Memo
   - 메모 | 조회하기 |   GET   | api/memos List<Memo>
   - 메모 | 변경하기 |   PUT   | /api/memos/{id} Long
   - 메모 | 삭제하기 |  DELETE | /api/memos/{id} Long