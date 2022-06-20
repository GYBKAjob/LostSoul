package Gibka.BibiB.lostsoul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList <ButtonHolder> levels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        levels = new ArrayList<>();
        levels.add(setbh(R.drawable.gamelevel1,
                "Очнувшись в каком-то подземелии, я не понимал как я тут оказался но был уверен что надо поскорее выбираться отсюда. Оглядев небольшое помещение в котором я был, я увидел дверь. Думаю мне туда",
                1, new int[]{1}, new String[]{"Идти"}//0
        ));
        levels.add(setbh(R.drawable.level2,
                "Да,видно ему повезло меньше чем мне. Буду считать за знак что нужно поскорее отсюда выбираться. Хоть я и не хочу копаться в костях, но у него может быть что нибудь интересное",
                2, new int[]{3, 2}, new String[]{"Обыскать", "Идти дальше"}//1

        ));
        levels.add(setbh(R.drawable.level4,
                "А вот и дверь. Ну, другого выхода у меня нет",
                1, new int[]{4}, new String[]{"Идти дальше"}//2
        ));
        levels.add(setbh(R.drawable.level2,
                "Поискав, я нашел у него в карманах записку следующего содержания:И вот зачем повернул налево после тоннеля, пошел бы направо, может и не гнил бы здксь",
                1, new int[]{2}, new String[]{"Идти дальше"}//3
        ));
        levels.add(setbh(R.drawable.level0,
                "Я вышел в другое помещение, побольше чем первое. Когда я поднял голову, мне в глаза ударил яркий свет. А вот и поверхность. Осталось найти способо туда попасть",
                1, new int[]{5}, new String[]{"Идти дальше"}//4
        ));
        levels.add(setbh(R.drawable.level5,
                "Повернувшись направо, я увидел длинный темный туннель, очень не хотелось идти туда, но выбора не предоставлялось",
                1, new int[]{6}, new String[]{"Пойти по туннелю"}//5
        ));
        levels.add(setbh(R.drawable.right,
                "Пройдя через этот темный туннель я вышел к развилке. Глядя направо я видел лишь тьму в конце",
                1, new int[]{7}, new String[]{"Посмотреть налево"}//6
        ));
        levels.add(setbh(R.drawable.pravo,
                "Взглянув налево я видел то же самое. Остался вопрос = куда идти?",
                2, new int[]{8, 11}, new String[]{"Налево", "Направо"}//7
        ));
        levels.add(setbh(R.drawable.smert1,
                "Идя по длинному темному коридор, я мслышал странный шум",
                1, new int[]{9}, new String[]{"Идти дальше"}//8
        ));
        levels.add(setbh(R.drawable.chern,
                "Последним звуком, который я услышал в своей жизини, был гул падающим на меня камней",
                1, new int[]{10}, new String[]{"Далее"}//9
        ));
        levels.add(setbh(R.drawable.end2,
                "",
                1, new int[]{0}, new String[]{"В меню"}//10
        ));
        levels.add(setbh(R.drawable.door,
                "Пройдя по длинному коридору я вышел к двери. Видно мне туда",
                1, new int[]{12}, new String[]{"Открыть дверь"}//11
        ));
        levels.add(setbh(R.drawable.pazvilka2,
                "Ну отлично, раньше хоть надо было выбирать из двух путей. И куда же идти чтоб свалить отсюда",
                3, new int[]{13, 16, 18}, new String[]{"Налево", "прямо", "Направо"}//12
        ));
        levels.add(setbh(R.drawable.smertmish1,
                "Свернув налево, я шел по каменному коридору и слышал странный звук, похожий на хлопанье крыльями",
                1, new int[]{14}, new String[]{"Идти дальше"}//13
        ));
        levels.add(setbh(R.drawable.mish,
                "Пройдя дальше, я увидел огромную летучую мышь, летящюю в мою сторону. В этот момент я понял, что мне конец",
                1, new int[]{15}, new String[]{"Далее"}//14
        ));
        levels.add(setbh(R.drawable.end2,
                "",
                1, new int[]{0}, new String[]{"В меню"}//15
        ));
        levels.add(setbh(R.drawable.good,
                "Пойдя прямо, я вышел в какую-то канализацию. И я решил идти вдоль течения воды. Спустя некоторое время блуждания мне стал виднется свет. Вот она - свобода",
                1, new int[]{17}, new String[]{"Идти Дальше"}//16
        ));
        levels.add(setbh(R.drawable.good1,
                "И вот я выбрался. Но оглядевшись, я понял что все не так хорошо как я думал. Ядерная пустошь, окружавашая меня вселяла в меня страх. Видно многое мне еще придется пережить",
                1, new int[]{0}, new String[]{"В Меню"}//17
        ));
        levels.add(setbh(R.drawable.level12,
                "Пройдя прямо я попал в еще один длинный темный коридо. Отлично, архитектор явно был дилетантом. Но вдруг я услышал странный скрип под ногами. Старые гнилые доски, закрывашие дыру в полу не выдержали моего веса и я полетел вниз",
                1, new int[]{19}, new String[]{"Идти Дальше"}//18
        ));
        levels.add(setbh(R.drawable.chern,
                "Мда, вроде высота небольшая, но падение было жестким. Я попытался встать, и судя по тому что у меня получилось, хоть и не с первого раза, я нк счастью ничего не сломал, отделался ушибами",
                1, new int[]{20}, new String[]{"Осмотреться"}//19
        ));
        levels.add(setbh(R.drawable.nora,
                "Оглядевшись, я понял что упал в какйто туннель, прорытый кем-то. И опять развилка. Такое чувство что создатель этих подземелий не обладает ни каплей креативности. Чтож ладно, остается решить куда идти",
                2, new int[]{21, 23}, new String[]{"налево", "направо"}//20
        ));
        levels.add(setbh(R.drawable.chern,
                "Повернув налево, я шел практически вслепую, пока в темноте не нащупал лестницу. а во и выход подумал я, и полез наверх",
                1, new int[]{22}, new String[]{"Идти Дальше"}//21
        ));
        levels.add(setbh(R.drawable.good1,
                "И вот я выбрался. Но оглядевшись, я понял что все не так хорошо как я думал. Ядерная пустошь, окружавашая меня вселяла в меня страх. Видно многое мне еще придется пережить",
                1, new int[]{0}, new String[]{"В Меню"}//22
        ));
        levels.add(setbh(R.drawable.die,
                "выйдя в большую пещере я увидел проход и направлся туда",
                1, new int[]{24}, new String[]{"Пройти в проход"}//23
        ));
        levels.add(setbh(R.drawable.chern,
                "Зайдя туда я обнаружил тупик. Но только я повернулся назад, как позлышался громкий звук и единственный выход завалило. Ну, теперь остается только медленно умирать от голода т жажды здесь, в кромечной тьме",
                1, new int[]{25}, new String[]{"далее"}//24
        ));
        levels.add(setbh(R.drawable.end2,
                "",
                1, new int[]{0}, new String[]{"В меню"}//25
        ));
        Button buttonStart  = (Button) findViewById(R.id.button3);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(MainActivity.this, LevelConstructor.class);
                    intent.putExtra("pos", 0);
                    startActivity(intent);finish();
                }catch (Exception e){

                }
            }
        });

    }
    ButtonHolder setbh(int background,String text,int num,int[] positions, String[] story){
        ButtonHolder bh = new ButtonHolder();
        bh.background = background;
        bh.text = text;
        bh.num = num;
        bh.positions = positions;
        bh.story = story;
        return bh;
    }
}
