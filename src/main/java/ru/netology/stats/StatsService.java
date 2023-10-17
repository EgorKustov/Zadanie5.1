package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int totalSale = 0;
        for (int sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public int average(int[] sales) {
        return sum(sales) / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonthSale = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonthSale]) {
                maxMonthSale = i;
            }
        }
        return maxMonthSale + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthsLessAverage(int[] sales) {
        int counter = 0;
        int averageSale = average(sales);
        for (int sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsMoreAverage(int[] sales) {
        int counter = 0;
        int averageSale = average(sales);
        for (int sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}



