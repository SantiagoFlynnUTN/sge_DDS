package lanzallamas.users.categories;

public enum Category {
    R1(18.76, 0.644),
    R2(35.32, 0.644),
    R3(60.71, 0.681),
    R4(71.74, 0.738),
    R5(110.38, 0.794),
    R6(220.75, 0.832),
    R7(443.59, 0.851),
    R8(545.96, 0.851),
    R9(887.19, 0.851);

    private double cargoFijo;
    private double cargoVariable;

    Category(double cargoFijo, double cargoVariable){
        this.cargoFijo = cargoFijo;
        this.cargoVariable = cargoVariable;
    }

    public static Category getInstance(int consumo){
        if(consumo <= 150){
            return R1;
        }

        if(consumo <= 325){
            return R2;
        }

        if(consumo <= 400){
            return R3;
        }

        if(consumo <= 450){
            return R4;
        }

        if(consumo <= 500){
            return R5;
        }

        if(consumo <= 600){
            return R6;
        }

        if(consumo <= 700){
            return R7;
        }

        if(consumo <= 1400){
            return R8;
        }

        return R9;
    }
}
