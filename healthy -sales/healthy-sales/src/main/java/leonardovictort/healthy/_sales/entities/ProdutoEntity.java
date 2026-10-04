package leonardovictort.healthy._sales.entities;

import jakarta.persistence.*;
import lombok.*;

@Setter @Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "produtos")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false,length = 6)
    private int codigo;

    @Column(name = "codigo_barras", unique = true,nullable = false,length = 20)
    private String codigoBarras;

    @Column(unique = true,nullable = false,length = 50)
    private String nome;

    @Column(name = "custo_medio_unitario", nullable = false)
    private double custoMedioUnitario;

    @Column(name = "preco_venda", nullable = false)
    private double precoVenda;

    @Column(nullable = false)
    private ProdutoGrupo grupo;

    @Column(nullable = false)
    private double icms;

    @Column(name = "margem_lubro", nullable = false)
    private double margemLucro;

    @Column(name = "despesa_operacional", nullable = false)
    private double despesaOperacional;

}
