package org.indra.claseQuince.dto;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class Exito {
	private String mensaje = "Operacion exitosa";
	@NonNull private String resultado;
	
	
}
