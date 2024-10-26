package INTERFACES;

class Auto extends VehiculoBase
    {
        private int gasolina;

        public Auto(int gasolinaInicial)
        {
            gasolina = gasolinaInicial;
        }

        public override void Conducir()
        {
            if (gasolina > 0)
            {
                Console.WriteLine("El coche está conduciendo.");
            }
            else
            {
                Console.WriteLine("No hay suficiente gasolina para conducir.");
            }
        }

        public override bool Retanquear(int cantidadGasolina)
        {
            gasolina += cantidadGasolina;
            Console.WriteLine($"Se ha tanquedado con {cantidadGasolina} unidades de gasolina. Gasolina actual: {gasolina}");
            return true;
        }
    }
