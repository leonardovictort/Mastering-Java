package leonardovictort.healthy._sales.domain.models;

import leonardovictort.healthy._sales.domain.exceptions.RegraNegocioException;
import leonardovictort.healthy._sales.entities.ProdutoEntity;
import leonardovictort.healthy._sales.entities.ProdutoGrupo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
public class Produto {

    private Integer id;
    private int codigo;
    private String codigoBarras;
    private String nome;
    private double custoMedioUnitario;
    private double precoVenda;
    private ProdutoGrupo grupo;
    private double icms;
    private double margemLucro;
    private double despesaOperacional;

    public Produto(Integer id, int codigo, String codigoBarras, String nome, double custoMedioUnitario,
                   double precoVenda, ProdutoGrupo grupo, double icms, double margemLucro, double despesaOperacional) {

        if (nome == null || nome.trim().isEmpty()) {
            throw new RegraNegocioException("O nome do produto não pode ser vazio.");
        }

        this.id = id;
        this.codigo = codigo;
        this.codigoBarras = codigoBarras;
        this.nome = nome;
        this.custoMedioUnitario = custoMedioUnitario;
        this.precoVenda = precoVenda;
        this.grupo = grupo;
        this.icms = icms;
        this.margemLucro = margemLucro;
        this.despesaOperacional = despesaOperacional;
    }

    public static Produto ProdutoFromEntity(ProdutoEntity entity){
        return new Produto(
                entity.getId(),
                entity.getCodigo(),
                entity.getCodigoBarras(),
                entity.getNome(),
                entity.getCustoMedioUnitario(),
                entity.getPrecoVenda(),
                entity.getGrupo(),
                entity.getIcms(),
                entity.getMargemLucro(),
                entity.getDespesaOperacional()
        );
    }


}