# :star2: THINKO
---

## :clipboard: 개요
### KH 정보교류 커뮤니티 
> KH 정보교육원 소속 교육생들의 정보 공유와 소통을 목적으로 시작된 프로젝트.
> 
> 같은강의실에서 공부하는 교육생 뿐만 아니라 다른 반, 나아가 다른 지원의 교육생들과 정보 공유.
> 
> 스터디 모집이나 프로그래밍 관련 질문 및 학생들의 고민을 서로 나누고 소통하며, 
> 
> 수료생들의 수기 및 취업 후기를 볼 수 있는 사이트.


## 사용기술 및 개발환경

> - OS: Windows 10 
> - WAS : Apache Tomcat 8.5 
> - 개발환경 및 툴 : Eclipse , Java8, Oracle, SQL Developer, VS Code
> - 사용한 기술 : Servlet, JSP, HTML, CSS3, JavaScript, jQuery
> - API : BootStrap, Java Mail, DataTables, Json, GSON, Summernote lite, Kakao map API
> - 형상관리 : GitHub

 
## :raised_hand: 역할 분담

> ### 김만희 
> - 메인 페이지, 헤더(검색 기능), 푸터, 댓글 작성 수정 삭제, 댓글 신고, 랜덤 메뉴 게임 
> ### 유현재
> - 게시글 상세 조회, 좋아요 및 신고 기능, 관리자 페이지, 카카오맵 API 연동
> ### 이정아
> - 게시글 작성 수정 삭제, 회원가입, 마이페이, 사이드 메뉴 
> ### 정연정
> - 게시글 목록 조회, 로그인, 아이디 비밀번호 찾기, 통합검색, 게시판 별 검색


---


## DB 설계


> <img src="https://user-images.githubusercontent.com/71631964/115952867-8d6b7400-a523-11eb-9e10-d13beb5e8191.png" width="너비 " height="높이">

----------------------------------------------------------------------------------------------------------------------------------------


## :clipboard: 구현 기능
--------------------------






### :arrow_forward: 로그인 화면 


> + 구현 기능 설명
> 
>   1. 메인 화면에서 로그인 버튼을 누르면 로그인 화면이 뜬다. 
> 
>   2. 아이디와 비밀번호를 칠 수 있다.
> 
>   3. 회원가입 된 아이디와 비밀번호를 치고 로그인 버튼을 누르면 로그인이 된다.
> 
>   4. 아이디 저장 체크박스를 누른 후 로그인을 하면 아이디가 저장된다.
> 
>   5. 하단에 아이디 찾기, 비밀번호 찾기, 회원가입 하이퍼링크를 누르면 해당 페이지로 이동한다.
>
> <img src="https://user-images.githubusercontent.com/71631964/115950296-5aba7f00-a515-11eb-8e0a-fe912b5a05f6.png" width="너비 " height="높이">

---


### :arrow_forward: 아이디 찾기 화면 


> + 구현 기능 설명
> 
>   1. 이름과 이메일을 입력한 후 아이디 찾기 버튼을 누르면 아이디 찾기 페이지로 이동한다. 
>   
>   2. 이름과 아이디 둘 중 하나라도 올바르지 않은 정보 입력 시 경고창이 출력된다.
>   
> <img src="https://user-images.githubusercontent.com/71631964/115950815-7b380880-a518-11eb-8543-e68fa251f153.png" width="너비 " height="높이">

---

### :arrow_forward: 아이디 찾기 성공 화면 


> + 구현 기능 설명
> 
>   1. 아이디 찾기 성공 시 유저의 아이디가 출력된다. 
>   
>   2. 비밀번호가 기억나는 경우 로그인 화면으로 돌아가기 버튼을 눌러 로그인을 시도한다.
>   
> <img src="https://user-images.githubusercontent.com/71631964/115950802-5e9bd080-a518-11eb-835e-0e7817bffb3d.png" width="너비 " height="높이">

---

### :arrow_forward: 비밀번호 찾기 화면 


> + 구현 기능 설명
> 
>   1. 아이디와 이메일을 입력한 후 비밀번호 찾기 버튼을 누르면 메인 화면으로 이동 후 “이메일을 통해 비밀번호를 재설정 해주세요” 라는 swal창이 출력된다.  
>   
>   2. 아이디과 이메일 둘 중 하나라도 올바르지 않은 정보 입력 시 경고창이 출력된다.
>   
> <img src="https://user-images.githubusercontent.com/71631964/115950780-39a75d80-a518-11eb-8149-e5217d8fd064.png" width="너비 " height="높이">

---

### :arrow_forward: 게시판 목록 화면 


> + 구현 기능 설명
> 
>   1. 게시글 검색 버튼을 누르면 검색이 가능하다.
>   
>   2. 게시글 작성 버튼을 누르면 게시글 작성 화면으로 이동한다. 
>   
>   3. 게시글이 10개씩 보여지게 하여 그 이상의 글들은 페이징 처리를 통해 그 다음장에 보여진다.
>   
>   4. 자유게시판일 경우 글쓴이가 익명으로 출력된다
>   
>   5. 썸네일이 있는 게시글일 경우 목록에 보여진다.
>   
>   6. 조회수와 카테고리가 보여진다.
>   
> <img src="https://user-images.githubusercontent.com/71631964/115950755-1e3c5280-a518-11eb-8640-f2b89423a0e9.png" width="너비 " height="높이">

---

### :arrow_forward: 검색 모달창 화면 


> + 구현 기능 설명
> 
>   검색 아이콘 버튼 클릭 시 검색 모달창이 출력된다.
>   
> <img src="https://user-images.githubusercontent.com/71631964/115950730-f77e1c00-a517-11eb-9348-06e317cddeaa.png" width="너비 " height="높이">

---

### :arrow_forward: 검색 결과 화면 


> + 구현 기능 설명
> 
>   1. 검색 시 게시글 작성, 검색 아이콘이 삭제된 후 SELECT 박스가 생성된다. 
>   
>   2. 검색 키워드와 함꼐 검색 결과 문장이 출력된다. 
>   
>   3. 키워드가 포함된 글 제목, 내용, 제목+내용, 작성자가 출력된다.
>   
> <img src="https://user-images.githubusercontent.com/71631964/115950625-568f6100-a517-11eb-8893-dfa2083f87c0.png" width="너비 " height="높이">

---

### :arrow_forward: 인기글 게시판 화면


> + 구현 기능 설명
> 
>   1. 전체 게시글 중에서 조회수가 많은 순으로 10개 내림차순 정렬된다. 
>   
>   2. 페이지네이션은 보여지지 않는다.
>   
> <img src="https://user-images.githubusercontent.com/71631964/115950604-352e7500-a517-11eb-8b20-5256635f279b.png" width="너비 " height="높이">

---



