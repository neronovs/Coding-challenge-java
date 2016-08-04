#include <stdio.h>
#include <cs50.h>
#include <stddef.h>

int main(void) {
    float change = -1.1;
    int intChange, count = 0;
    
    printf("O hai! How much change is owed?\n");
    
    do {
        change = GetFloat();
        if (change < 0) printf("How much change is owed?\n");
    } while (change < 0);

    change *= 100;
    change = change + 0.5;
    intChange = (int) change;
    
    if (intChange >= 25) {
        int tmp = intChange / 25;
        count += tmp;
        intChange -= 25 * tmp;
    }
    if (intChange >= 10) {
        int tmp = intChange / 10;
        count += tmp;
        intChange -= 10 * tmp;
    }
    if (intChange >= 5) {
        int tmp = intChange / 5;
        count += tmp;
        intChange -= 5 * tmp;
    }
    count += intChange;
    
    printf("%d\n", count);
}
