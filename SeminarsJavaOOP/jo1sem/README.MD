Методы toGo, fly, swim не должны быть в классе Animal, 
т.к. не все животные умеют бегать, плавать, или летать.
И при создании нового класса наследника класса Animal,
у нового класса обязательно нужно писать, что этот тип
животного не умеет, то или иное делать.
А если этих умений 1000, то придётся писать, 
1000 переопределений
Лучше эти умения описывать в каждом конкретном экземпляре


В реальности есть подкатегории. Классы Eagle, Shark,
Duck - это подклассы других классов, таких как Bird,
Fish.

При переопределении метода swim в классе Bird, написать там
что птицы не плавают, потом создать объект eagle и вызвать
метод swim, то выводит сообщение, что Bird не плавает,
а не конкреный экземпляр(eagle) не плавает,
При этом некоторые птицы умеют плавать.

Пытался создать классы Bird, Fish, потом от этих классов 
сделать наследников, классы Eagle, Shark, Duck, возникли
проблемы с переопределением методов toGo, fly, swim 
класса Animal. Они не переопределялись в этих подклассах