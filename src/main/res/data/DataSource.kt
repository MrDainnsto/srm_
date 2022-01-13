package data

import android.annotation.SuppressLint
import com.example.crm.R
import model.Car
import model.Light
import model.Type

object DataSource {
    val Cars = listOf(
        Car(R.drawable.prio,"Лада Приора","Самый понтовый автомобиль среди молодых стритрейсеров и суетологов. Отличается меньшей доступностью."),
        Car(R.drawable.kalina,"Лада Калина","Наименее исполнительный автомобиль для ценителей."),
        Car(R.drawable.dven,"ВАЗ 2112","Доступный и пацанский ТАЗ")
    )
    @SuppressLint("ResourceType")
    val Lights = listOf(
        Light(0,"Лада Калина","ПТФ Sal-Man Белые Светодиодные Ближний/Дальний, 5 линз", "ПТФ",3500),
        Light(1,"ВАЗ 2112","ПТФ Sal-Man Белые Светодиодные Ближний/Дальний, 7 линз", "ПТФ", 3300)
    )
    val Types = listOf(
        Type(R.drawable.H7,"Освещение","Здесь ты найдешь всё что нужно, чтобы видеть дорогу и быть при этом стильным парнем."),
        Type(R.drawable.valve,"Двигатель","Валы, впуск, выпуск, ну ты понял")
    )
}