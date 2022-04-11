import { IUser, UserItem } from './user';


export class Model {
    items: Array<IUser> = [];

    constructor() {
        this.items.push(new UserItem(1, 'Christian', '250977cc', 'dd@dddit', true));
        this.items.push(new UserItem(1, 'Christian', '250977cc', 'dd@dddit', true));
        this.items.push(new UserItem(1, 'Christian', '250977cc', 'dd@dddit', true));
        this.items.push(new UserItem(1, 'Christian', '250977cc', 'dd@dddit', true));
    }
}