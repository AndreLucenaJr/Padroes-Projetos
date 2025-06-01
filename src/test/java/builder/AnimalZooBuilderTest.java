package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalZooBuilderTest {

    @Test
    void deveRetornarExcecaoParaAnimalSemEspecie() {
        try {
            AnimalZooBuilder builder = new AnimalZooBuilder();
            AnimalZoo animal = builder
                    .setNome("Leão")
                    .setPeso(190.5)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Espécie inválida", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaAnimalSemNome() {
        try {
            AnimalZooBuilder builder = new AnimalZooBuilder();
            AnimalZoo animal = builder
                    .setEspecie("Panthera leo")
                    .setPeso(190.5)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAnimalValido() {
        AnimalZooBuilder builder = new AnimalZooBuilder();
        AnimalZoo animal = builder
                .setEspecie("Panthera leo")
                .setNome("Leão")
                .setPeso(190.5)
                .build();

        assertNotNull(animal);
    }
}
