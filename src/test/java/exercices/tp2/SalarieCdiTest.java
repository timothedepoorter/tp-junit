package exercices.tp2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class SalarieCdiTest {
    Salaire salaireMock;
    Identite identiteMock;
    SalarieCdi salarieCdi;
    Adresse adresseMock;
    @BeforeEach
    public void setUpEach() {
        adresseMock = mock(Adresse.class);

        salaireMock = mock(Salaire.class);
        when(salaireMock.getTauxHoraire()).thenReturn(17.8);
        identiteMock = mock(Identite.class);
        when(identiteMock.getAdresse()).thenReturn(adresseMock);

        salarieCdi = new SalarieCdi(salaireMock, identiteMock);
    }

    @Test
    public void testDemenager() {
        salarieCdi.demenager(adresseMock);
        verify(
                identiteMock,
                times(1)
        ).setAdresse(adresseMock);
    }

    @Test
    public void testTravaillerSansParam() {
        salarieCdi.travailler();
        verify(
                salaireMock,
                times(1)
        ).payer(151);
    }

    @Test
    public void testTravaillerAvecParam() {
        salarieCdi.travailler(161);
        verify(
                salaireMock,
                times(1)
        ).payer(161);
    }

    @Test
    public void testAugmenter() {
        salarieCdi.augmenter(10);
        verify(
                salaireMock,
                times(1)
        ).setTauxHoraire(17.8 * 1.1);
    }

}