package com.springapideneme.dto;

import java.util.List;
import javax.validation.constraints.NotNull;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = {"id"})
@ApiModel(value = "Kisi-API-Entity",description = "Kisi-Entity")
public class KisiDto {

    @ApiModelProperty(value = "Kisi id alani")
    private Long id;

    @NotNull
    @ApiModelProperty(value = "Kisi adi alani")
    private String adi;

    @ApiModelProperty(value = "Kisi soyadi alani")
    private String soyadi;

    //@ApiModelProperty(value = "Kisi adresler alani")
    private List<String> adresler;
}
