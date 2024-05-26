# Втора лабораториска вежба по Софтверско инженерство

## Владимир Христовски, бр. на индекс 223030

###  Control Flow Graph

![SILab2](https://github.com/vladimirhristovski/SI_2024_lab2_223030/assets/117442187/af7c0338-a923-48ee-83e2-d1db32558a13)

### Цикломатска комплексност

Цикломатската комплексност на овој код е 10, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли(if-ови и for-ови во нашиот случај). Во случајoв P=9, па цикломатската комплексност изнесува 10.

### Тест случаи според критериумот Every Branch 

![SILab2EB](https://github.com/vladimirhristovski/SI_2024_lab2_223030/assets/117442187/ebc5e19d-2fd0-4276-94d8-55ebc8fbbe17)

### Тест случаи според критериумот Multiple Condition

![SLlab2MC](https://github.com/vladimirhristovski/SI_2024_lab2_223030/assets/117442187/d74d5e7b-9bb8-40da-ab6d-e22855124250)

### Објаснување на напишаните unit tests

Тест случаи за Every Branch критериумот:
1. allItems = null, payment = whatever
- Се праќа null вредност на листата allItems, со цел да се фрли RuntimeException("allItems list can't be null!").

2. allItems = [Item(Name = null, Barcode = 012, Price = 350, Discount = -1), Item(Name = something, Barcode = 123, Price = 250, Discount = 0.5)], payment = 1000
- Се праќа листа со 2 објекти и голема вредност за payment, со цел да се врати true.

3. allItems = [Item(Name = null, Barcode = 012, Price = 350, Discount = -1), Item(Name = something, Barcode = 123, Price = 250, Discount = 0.5)], payment = 10
- Се праќа листа со 2 објекти и маla вредност за payment, со цел да се врати false.

4. allItems = [Item(Name = null, Barcode = a, Price = 350, Discount = -1)], payment = 10
- Се праќа листа со 1 објект со несоодветна вредност на атрибутот Barcode, со цел да се фрли RuntimeException("Invalid character in item barcode!").

5. allItems = [Item(Name = null, Barcode = null, Price = 350, Discount = -1)], payment = 10
- Се праќа листа со 1 објект со null вредност на атрибутот Barcode, со цел да се фрли RuntimeException("No barcode!").

Тест случаи за Multiple Condition критериумот:
1. allItems = [Item(Name = 012, Barcode = null, Price = 350, Discount = 0.5)],  payment = 10
- Со овој тест условите во if условот би биле true && true && true со што програмата ќе продолжи да се извршува во if условот.

2. allItems = [Item(Name = 123, Barcode = null, Price = 350, Discount = 0.5)],  payment = 10
- Со овој тест условите во if условот би биле true && true && false со што програмата нема да продолжи да се извршува во if условот.

3. allItems = [Item(Name = 123, Barcode = null, Price = 350, Discount = -1)],  payment = 10
- Со овој тест условите во if условот би биле true && false && false со што програмата нема да продолжи да се извршува во if условот.

4. allItems = [Item(Name = 123, Barcode = null, Price = 250, Discount = -1)],  payment = 10
- Со овој тест условите во if условот би биле false && false && false со што програмата нема да продолжи да се извршува во if условот.
