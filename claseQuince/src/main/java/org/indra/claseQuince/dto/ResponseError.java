package org.indra.claseQuince.dto;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class ResponseError {
	
	private String mensaje = "Operacion fallida";
	@NonNull private Object detalle;

}
