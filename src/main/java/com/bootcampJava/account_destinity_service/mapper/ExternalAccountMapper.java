package com.bootcampJava.account_destinity_service.mapper;

import com.bootcampJava.account_destinity_service.dto.ExternalAccountResponse;
import com.bootcampJava.account_destinity_service.entity.ExternalAccount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ExternalAccountMapper {
    
    ExternalAccountMapper INSTANCE = Mappers.getMapper(ExternalAccountMapper.class);
    
    @Mapping(target = "externalAccountId", source = "externalAccountId")
    ExternalAccountResponse toExternalAccountResponse(ExternalAccount externalAccount);
}
