package itallodavid.github.accesscontrol.mappers;

import itallodavid.github.accesscontrol.dto.CompanyCreationDTO;
import itallodavid.github.accesscontrol.models.Company;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CompanyMapper {
    CompanyMapper INSTANCE = Mappers.getMapper(CompanyMapper.class);

    Company toEntity(final CompanyCreationDTO companyCreationDTO);
}
