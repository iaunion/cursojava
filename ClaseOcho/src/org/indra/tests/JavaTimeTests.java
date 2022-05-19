package org.indra.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.time.*;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JavaTimeTests {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testLocalTime() {
		
		LocalTime horaArgentina = LocalTime.now(ZoneId.of("America/Argentina/Salta")).truncatedTo(ChronoUnit.SECONDS);
		LocalTime horaEspaña = LocalTime.now(ZoneId.of("Europe/Madrid")).truncatedTo(ChronoUnit.SECONDS);
		
		assertEquals(horaArgentina.plusHours(5),horaEspaña);
		
	}

}
