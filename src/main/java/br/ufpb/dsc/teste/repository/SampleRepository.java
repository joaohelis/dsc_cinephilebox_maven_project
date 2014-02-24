package br.ufpb.dsc.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufpb.dsc.teste.model.Sample;

public interface SampleRepository extends JpaRepository<Sample, Long> {

}
