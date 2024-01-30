package telran.drones.model;

import jakarta.persistence.*;
import lombok.Getter;
@Entity
@Table(name="medications")
@Getter
public class Medication {
	@Id
	String code;
	@Column(nullable = false)
	String name;
	@Column(nullable = false)
	int weight;
}
