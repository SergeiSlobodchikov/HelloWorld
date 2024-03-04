## Задание 2
Этот код представляет собой класс [Post](https://github.com/SergeiSlobodchikov/HelloWorld/blob/main/m2_layout/app/src/main/java/com/example/layout/Post.kt), который является расширением LinearLayout. Класс Post используется для создания виджета, который может отображать два разных макета [Post](https://github.com/SergeiSlobodchikov/HelloWorld/blob/main/m2_layout/app/src/main/res/layout/post.xml) и [Post2](https://github.com/SergeiSlobodchikov/HelloWorld/blob/main/m2_layout/app/src/main/res/layout/post2.xml), переключаясь между ними.

В конструкторе класса Post используются методы inflate для создания и привязки данных к PostBinding и Post2Binding. Затем создается переменная currentView, которая хранит ссылку на текущий вид.

В методе init создается случайное число, которое определяет, какой макет будет отображаться. Затем текущий вид добавляется в Post.

Методы setTopText и setBottomText используются для установки текста в верхнем и нижнем виджетах соответственно.

Таким образом, этот код позволяет создать виджет, который может отображать два разных макета, переключаясь между ними.
