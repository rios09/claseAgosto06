
package saveData;
import DataAccess.Data;					// aca importamos las clases Data, el java.util.List y la clase NominaFile papus
import java.io.File;
import File.NominaFile;
import interfaz.MenuNomina;

import java.util.List;
public class DataSave  {
	private Data d;
	private List<Data> data;				// aca asiganomos un nuevo nombre a la lista creada para ser utilizada exclusivamente en esta clase
	private NominaFile nominafile; 		// lo mismo hacemos con la clase NominaFile
	
										// luego realizamos el encapsulamiento con los Get y Set solo para el atributo data
					
	
	public DataSave() {
		nominafile = new NominaFile();
	}
	
	
	
	public void setData(List<Data> data) {	// aca basicamente captura los datos de la lista data y los datos de los metodos de la clase NominaFile
		this.data = data;
		nominafile = new NominaFile();
	}

	
	
	public void save(String path){			// este metodo permite guardar el archivo de texto creado en la clase NominaFile dentro den un directorio creado en la computadora, a su vez tambien le tenemos que asignar un nombre al archivo de texto
		File myfile = new File(path);	// El parametro "Path" es la ruta o directorio en donde vamos a guardar el archivo
		if(myfile!=null) {				// Aca hacemos una evaluacion, si el archivo es diferente de nulo, el archivo se guardara dentro del la ruta indicada con anterioridad
			nominafile.save(myfile, data);
	
		}
	}
	
	
	

	
	
	
	public List<Data> getData(String path) {	// aca realizamos la lectura del archivo guardado con anterioridad
		File myfile = new File(path); // aca igualmente indicamos la ruta y nombre con el que fue guardado el archivo en el metodo anterior
		if(myfile!= null) {	// aca volvemos a realizar la evaluacion
			data = nominafile.read(myfile); // al realizar la evaluacion, y si el directorio y el archivo existen, entonces hara la lectura de datos
		}
		return data; // y aca retornamos la informacion guardada dentro del archivo de text, que en este caso seria la nomina
	}
		
	
	
	}	

