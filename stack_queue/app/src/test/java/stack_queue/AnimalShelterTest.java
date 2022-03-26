package stack_queue;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalShelterTest {
    @Test
    public void enqueue() {
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(new Animal("cat"));
        animalShelter.enqueue(new Animal("dog"));

        assertEquals( "cat", animalShelter.front.value.toString());
        assertEquals("dog", animalShelter.front.next.value.toString());
    }

    @Test
    public void dequeue() {
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(new Animal("cat"));
        animalShelter.enqueue(new Animal("dog"));
        animalShelter.enqueue(new Animal("raccoon"));

        assertEquals( "cat", animalShelter.dequeue("cat").toString());
        assertEquals( "raccoon", animalShelter.dequeue("raccoon").toString());
    }

    @Test
    public void peek() {
        AnimalShelter animalShelter = new AnimalShelter();
        animalShelter.enqueue(new Animal("cat"));
        assertTrue(animalShelter.front.value.toString() == "cat");

        animalShelter.enqueue(new Animal("dog"));
        assertTrue(animalShelter.front.value.toString() == "cat");

        animalShelter.dequeue("raccoon");
        assertTrue(animalShelter.front.value.toString() == "cat");
    }

}