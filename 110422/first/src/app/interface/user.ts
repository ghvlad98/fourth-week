export interface IUser {
    id: number;
    name: string;
    password: string;
    email: string;
    enabled?: boolean;
}

export class UserItem {
    id: number;
    name: string;
    password: string;
    email: string;
    enabled?: boolean;

    constructor(id: number, name: string, password: string, email: string, enabled: boolean) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.enabled = enabled;
    }
}