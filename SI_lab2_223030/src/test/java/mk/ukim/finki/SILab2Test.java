package mk.ukim.finki;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    @Test
    void everyBranchTest(){
        RuntimeException ex;

        //1.
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 5));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        //2.
        assertTrue(() -> SILab2.checkCart(List.of(new Item(null,"012",350,0.5F), new Item("something","123",250, -1)), 1000));

        //3.
        assertFalse(() -> SILab2.checkCart(List.of(new Item(null,"012",350,0.5F), new Item("something","123",250, -1)), 10));

        //4.
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item(null,"a",350,-1)), 10));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

        //5.
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item(null,null,350,-1)), 10));
        assertTrue(ex.getMessage().contains("No barcode!"));
    }

    @Test
    void multipleConditionTest(){
        RuntimeException ex;

        //1.
        assertTrue(() -> SILab2.checkCart(List.of(new Item("something","012",350,0.5F)),145));

        //2.
        assertFalse(() -> SILab2.checkCart(List.of(new Item("something","123",350,0.5F)),145));

        //3.
        assertFalse(() -> SILab2.checkCart(List.of(new Item("something","123",350,-1)),145));

        //4.
        assertFalse(() -> SILab2.checkCart(List.of(new Item("something","123",250,-1)),145));
    }
}