# Will



### 유언장 작성



api 

- /will/register

param

- uid - 사용자 이메일
- title - 제목
- content- 내용(글)
- video - 비디오
- image - 이미지
- witness - 증인(이메일)
- receive - 유언장 받을사람
- senddate - 2020.9.30-11.50

result

- success

### 자신의 모든 유언장 보기

api 

- /will/user/{userId} - get

param

- userId - pathparam

result

- List<WillEntity> 



# will receive



### 받은 모든 유언장 보기

api 

- /will/receive

param

- ruid - 사용자 이메일

result

- list<WillEntity>



### 받은유언장해쉬 입력하기

api 

- /will/savetransaction

param

- ruid - 사용자 이메일
- hash - 이메일에서 받은거

result

- list<WillReceiveEntity>