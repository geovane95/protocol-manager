package br.gov.sp.ferrazdevasconcelos.protocolmanager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
public abstract class EntityAccess {
    
    @Id
    @GeneratedValue
    private Integer id ;
    private Integer createdBy;
    private Date createdDate;
    private Integer lastModifiedBy;
    private Date lastModifiedDate;
}