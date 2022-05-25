package org.indra.main;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class Automovil {
	
	private int id;
	private @NonNull String marca;
	private @NonNull String modelo;
	private int kilometros;

}
