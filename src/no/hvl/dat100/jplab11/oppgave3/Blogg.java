package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;

import no.hvl.dat100.jplab11.oppgave1.Innlegg;

public class Blogg {

	// TODO: objektvariable
	
	
	  private Innlegg[] innleggtabell;
	    private int nesteledig;

	public Blogg() {
		this(20); // 20 plasser i tabellen
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
        nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteledig; i++) {
            if (innleggtabell[i].erLik(innlegg)) {
                return i;
            }
        }
        return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
		
	}

	public boolean ledigPlass() {
		return nesteledig < innleggtabell.length;

	}
	
	public boolean leggTil(Innlegg innlegg) {

		if (ledigPlass()) {
            innleggtabell[nesteledig] = innlegg;
            nesteledig++;
            return true;
        } else {
            return false; // visst tabellen er full
        }
    }
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nesteledig; i++) {
            sb.append(innleggtabell[i].toString());
        }
        return sb.toString();
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}