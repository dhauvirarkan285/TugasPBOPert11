/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspert11;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author RAISSA
 */
@Entity
@Table(name = "depokeretasbi")
@XmlRootElement
public class Depokeretasbi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_armada")
    private Integer idArmada;
    @Basic(optional = false)
    @Column(name = "nomor_armada")
    private String nomorArmada;
    @Basic(optional = false)
    @Column(name = "jenis_armada")
    private String jenisArmada;
    @Basic(optional = false)
    @Column(name = "tanggal_mulai_dinas")
    @Temporal(TemporalType.DATE)
    private Date tanggalMulaiDinas;
    @Column(name = "tanggal_perawatan_terakhir")
    @Temporal(TemporalType.DATE)
    private Date tanggalPerawatanTerakhir;
    @Column(name = "tanggal_perawatan_berikutnya")
    @Temporal(TemporalType.DATE)
    private Date tanggalPerawatanBerikutnya;

    public Depokeretasbi() {
    }

    public Depokeretasbi(Integer idArmada) {
        this.idArmada = idArmada;
    }

    public Depokeretasbi(Integer idArmada, String nomorArmada, String jenisArmada, Date tanggalMulaiDinas) {
        this.idArmada = idArmada;
        this.nomorArmada = nomorArmada;
        this.jenisArmada = jenisArmada;
        this.tanggalMulaiDinas = tanggalMulaiDinas;
    }

    public Integer getIdArmada() {
        return idArmada;
    }

    public void setIdArmada(Integer idArmada) {
        this.idArmada = idArmada;
    }

    public String getNomorArmada() {
        return nomorArmada;
    }

    public void setNomorArmada(String nomorArmada) {
        this.nomorArmada = nomorArmada;
    }

    public String getJenisArmada() {
        return jenisArmada;
    }

    public void setJenisArmada(String jenisArmada) {
        this.jenisArmada = jenisArmada;
    }

    public Date getTanggalMulaiDinas() {
        return tanggalMulaiDinas;
    }

    public void setTanggalMulaiDinas(Date tanggalMulaiDinas) {
        this.tanggalMulaiDinas = tanggalMulaiDinas;
    }

    public Date getTanggalPerawatanTerakhir() {
        return tanggalPerawatanTerakhir;
    }

    public void setTanggalPerawatanTerakhir(Date tanggalPerawatanTerakhir) {
        this.tanggalPerawatanTerakhir = tanggalPerawatanTerakhir;
    }

    public Date getTanggalPerawatanBerikutnya() {
        return tanggalPerawatanBerikutnya;
    }

    public void setTanggalPerawatanBerikutnya(Date tanggalPerawatanBerikutnya) {
        this.tanggalPerawatanBerikutnya = tanggalPerawatanBerikutnya;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArmada != null ? idArmada.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Depokeretasbi)) {
            return false;
        }
        Depokeretasbi other = (Depokeretasbi) object;
        if ((this.idArmada == null && other.idArmada != null) || (this.idArmada != null && !this.idArmada.equals(other.idArmada))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tugaspert11.Depokeretasbi[ idArmada=" + idArmada + " ]";
    }
    
}
