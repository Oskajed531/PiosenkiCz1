package pl.zajecia.piosenki;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController

@RequestMapping("/api/piosenki")
public class PiosenkiCasseteApi {
	private List<PiosenkiCassete> piosenkiCassetes;

	public PiosenkiCasseteApi() {
		piosenkiCassetes=new ArrayList<>();
		piosenkiCassetes.add(new PiosenkiCassete(1L,"tytul1", LocalDate.of(1999,2,2)));
		piosenkiCassetes.add(new PiosenkiCassete(2L,"tytul2", LocalDate.of(2022,8,12)));

	}
	@GetMapping("/all")
		public List<PiosenkiCassete>getAll(){
		return piosenkiCassetes;
	}
	@GetMapping
	public PiosenkiCassete getById(@RequestParam int index){
		Optional<PiosenkiCassete> first=piosenkiCassetes
		.stream()
		.filter(element->element.getId()==index)
		.findFirst();
		return first.get();
	}

	@PostMapping
	public boolean addPiosenki(@RequestBody PiosenkiCassete piosenkiCassete){
		return piosenkiCassetes.add(piosenkiCassete);
	}
	@PutMapping
	public boolean updatePiosenki(@RequestBody PiosenkiCassete piosenkiCassete){
		return piosenkiCassetes.add(piosenkiCassete);
	}
	@DeleteMapping
	public boolean deletePiosenki(@RequestParam int index){
		return piosenkiCassetes.removeIf(element->element.getId()==index);
	}

}
