import React from 'react'
import KaficService from '../services/KaficService';

class UserComponent extends React.Component{
    constructor( props)
    {
        super(props);
        this.state={
            kafici:[]
        }
    }

    componentDidMount()
    {
        KaficService.findAll().then((response) =>
        {
            this.setState({kafici: response.data})
        })
    }

    render()
    {
        return (
            <div>
                <h1>Kafici:</h1>
               console.log(kafici);
            </div>
        )
    }

}
export default UserComponent