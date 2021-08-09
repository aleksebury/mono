package com.abury.mono.repository;

import com.abury.mono.entity.TransactionInfoEntity;
import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;

public interface TransactionInfoRepository extends DatastoreRepository<TransactionInfoEntity, Long> {
}
