# 📘 Today I Learned

### 1. 오늘 배운 내용

React Hooks 공부
날짜: 2026.06.25

---

### 2. 핵심 정리

1. useState
   import 항상 해 둬야 한다!

function Comp() {
const [x, y] = useState(123);
// y로 뭔가 하면 됨
}

state는 바뀌는거임. set하면 바뀜. 근데 console.log 하면 안 바뀌는거 같기도 하고…
StrictMode? 그거 뭔지 잘 모르겠음 (나중에 더 공부해보자!). useState를 두 번 호출한다고 한다.

```js
잘못된 예시
setAge(age + 1);
setAge(age + 1);
setAge(age + 1);

맞는 예시
setAge((a) => a + 1);
setAge((a) => a + 1);
setAge((a) => a + 1);

```

### 3. 결과 이미지(스크린샷)
<img width="2879" height="1799" alt="image (5)" src="https://github.com/user-attachments/assets/a258b8d2-1dcf-46dc-81ae-07a6e16b1180" />


### 4. 느낀 점

useState는 변수를 가져다 쓸 수 있고, 바꿀 수도 있다! 근데 set을 이용해서만 바꿀 수 있다!
나중에 더 공부하기로 한 내용들을 잊지말고 더 공부하자!
