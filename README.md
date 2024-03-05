## Задание 2
Этот код представляет собой класс [Post](https://github.com/SergeiSlobodchikov/HelloWorld/blob/main/m2_layout/app/src/main/java/com/example/layout/Post.kt), который является расширением LinearLayout. Класс Post используется для создания виджета, который может отображать два разных макета [Post](https://github.com/SergeiSlobodchikov/HelloWorld/blob/main/m2_layout/app/src/main/res/layout/post.xml) и [Post2](https://github.com/SergeiSlobodchikov/HelloWorld/blob/main/m2_layout/app/src/main/res/layout/post2.xml), переключаясь между ними.

В конструкторе класса Post используются методы inflate для создания и привязки данных к PostBinding и Post2Binding. Затем создается переменная currentView, которая хранит ссылку на текущий вид.

В методе init создается случайное число, которое определяет, какой макет будет отображаться. Затем текущий вид добавляется в Post.

Методы setTopText и setBottomText используются для установки текста в верхнем и нижнем виджетах соответственно.

Таким образом, этот код позволяет создать виджет, который может отображать два разных макета, переключаясь между ними.

## Задание 3

Код [activity_seminar](https://github.com/SergeiSlobodchikov/HelloWorld/blob/main/m4_constraint/app/src/main/res/layout/activity_seminar.xml) представляет собой XML-файл, который используется для создания пользовательского интерфейса в Android. Он определяет макет, который содержит несколько ImageView и TextView. 

ImageView с id "cover" имеет изображение "the_beatles" и занимает всю ширину и высоту родительского элемента. ImageView с id "play" имеет изображение "baseline_play_circle_24" и располагается под ImageView "cover". ImageView с id "skipNext" и "skipPrev" имеют изображения "baseline_skip_next_24" и "baseline_skip_previous_24" соответственно и располагаются по обе стороны от ImageView "play".

TextView с id "artist" и "title" имеют стиль "TextStyle" и содержат строки "beatles" и "music" соответственно. Они располагаются под ImageView "play".

Все элементы макета располагаются с помощью ConstraintLayout, который позволяет задавать ограничения для каждого элемента.
