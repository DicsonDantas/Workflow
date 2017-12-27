package conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import model.dao.TipoHabilidadeDAO;
import model.Habilidade;

@FacesConverter(value="habilidade-converter", forClass=Habilidade.class)
public class HabilidadeConverter implements Converter {

	@Override
	//PROCURAR ENTENDER MELHOR ESTE TRECHO
	public Object getAsObject(FacesContext context, UIComponent component, String value) {


		System.out.println("HabilidadeConverter.getAsObject()");
		
		Habilidade habilidade = null;
		Integer id;
		
		try {
			id = Integer.parseInt(value);
		} catch (NumberFormatException e) {
			id = null;
		}
		
		TipoHabilidadeDAO dao = new TipoHabilidadeDAO();
		if (id != null)
			 habilidade = dao.lerPorId(id);
		
		return habilidade;

	}
	
	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {

		System.out.println("HabilidadeConverter.getAsString()");
		
		if (value instanceof Habilidade)
		{
			Habilidade habilidade = (Habilidade) value;
			return habilidade.getId().toString();
		}
		return null;
			
	}



}
