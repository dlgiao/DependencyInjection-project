package main

import (
	"fmt"
	"kmmania.com/di_go/hr"
	"kmmania.com/di_go/mas"
)

// main is the entry point of the program.
func main() {
	// Demonstrate using MAS data source.
	createMasService()

	// Demonstrate using HR data source.
	createHRService()
}

// createMasService demonstrates creating and using the MAS (Maximal Aerobic Speed) service.
func createMasService() {
	fmt.Println("*** Easy jog speed by MAS ***")

	// Create MAS DAO and service instances.
	daoMas := mas.DaoImplMas{}
	serviceMas := mas.ServiceImplMas{Dao: &daoMas}

	// Compute easy jog speed using MAS.
	resultMas := serviceMas.Compute()
	fmt.Printf("Compute easy jog by MAS: %.2f km/h\n", resultMas)

	fmt.Println("*** End ***")
}

// createHRService demonstrates creating and using the HR (Heart Rate) service.
func createHRService() {
	fmt.Println("*** Easy jog by HR ***")

	// Create HR DAO and service instances.
	daoHr := hr.DaoImplHr{}
	serviceHr := hr.ServiceImplHr{Dao: &daoHr}

	// Compute easy jog using HR.
	resultHr := serviceHr.Compute()
	fmt.Printf("Compute easy jog by HR: %.2f bpm\n", resultHr)

	fmt.Println("*** End ***")
}
