# Угадай карту

Простая карточная игра, написанная на Java, где игроку нужно угадать цвет карты (черный или красный). Проект включает две реализации: одна отображает карты цветными картинками, а другая — монохромным текстом.

## Описание игры

### Процесс игры:
1. Создается колода из 52 карт (от 2 до Туза).
2. Колода перемешивается.
3. Игрок последовательно угадывает цвет карты (черный или красный).
4. Игра продолжается до тех пор, пока колода не закончится.

### Дополнительные возможности:
- Для тех, кому игра кажется слишком простой, можно добавить другие варианты ставок:
    - Угадать масть карты (пики, червы, трефы, бубны).
    - Угадать число или картинку (например, валет, дама, король, туз).

## Требования
- В проекте должно быть два `main`:
    - Один отображает карты цветными картинками.
    - Второй отображает карты монохромным текстом.
- Использование ООП для создания универсальных классов для карточных игр.
- Разделение модели и представления (MVC или подобный подход).

## Сущность двустороннии счетчик: ScoreCounter
- Текущее значение score
- Минимальное значение minScore
- Максимальное значение maxScore
- Увеличить значение: add(int value) 
- Уменьшить значение: sub(int value)
- Методы isMin() isMax()
- 
## Game process with bet and counter:
- Show user balance (1000 by default) `userBalanceCounter`
- Ask about a bet and store it in `betValue`
- Ask about the card
- Show the correct answer and who is the winner
  - If the user guess is right, add the bet value to the user balance
  - If not, subtract the bet value from the user balance
- The process repeats if cards are available and the user balance is positive or until the user loses all balance



## Цели проекта
- Прокачать навыки декомпозиции в ООП стиле.
- Создать универсальные классы для любой карточной игры.
- Разобраться в разделении моделей и представлений.
- Практика работы с интерфейсами.

## Структура проекта
```
GuessTheCard/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── card/
│   │   │   │   ├── Card.java              # Класс карты
│   │   │   │   ├── Deck.java              # Класс колоды
│   │   │   ├── renderer/
│   │   │   │   ├── CardRenderer.java      # Интерфейс для рендеринга карт
│   │   │   │   ├── ImageRenderer.java     # Рендерер для цветных картинок
│   │   │   │   ├── TextRenderer.java      # Рендерер для монохромного текста
│   │   │   ├── game/
│   │   │   │   ├── GuessTheCardGame.java  # Основная логика игры
│   │   ├── resources/                     # Картинки для карт
│   ├── test/                              # Тесты (опционально)
├── README.md
```

## Как запустить
1. Клонируйте репозиторий:
   ```bash
   git clone https://github.com/ваш-username/GuessTheCard.git
   ```
2. Перейдите в директорию проекта:
   ```bash
   cd GuessTheCard
   ```
3. Соберите проект с помощью Maven или вашего любимого инструмента сборки:
   ```bash
   mvn clean install
   ```
4. Запустите одну из реализаций:
    - Для цветных картинок:
      ```bash
      java -cp target/classes card.game.ImageMain
      ```
    - Для монохромного текста:
      ```bash
      java -cp target/classes card.game.TextMain
      ```

## Дополнительные задачи
- Добавить возможность угадывать масть карты.
- Добавить возможность угадывать число или картинку.
- Реализовать систему подсчета очков.

5. Build and Run

From the project root (card-game/):
bash
Copy

# Build the project
mvn clean package
# Run the JAR
java -jar target/card-game-1.0-SNAPSHOT.jar

---

Удачи в разработке! 🚀## Лицензия

Этот проект распространяется под лицензией MIT. Подробности см. в файле [LICENSE](https://opensource.org/license/mit).

---

Удачи в разработке! 🚀
Have fun! 🚀
```