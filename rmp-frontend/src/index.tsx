import React from 'react';
import ReactDOM from 'react-dom/client';
import {BrowserRouter as Router, Navigate, Route, Routes} from 'react-router-dom';
import OverviewPage from './pages/Overview';

const root = ReactDOM.createRoot(
    document.getElementById('root') as HTMLElement
);

root.render(
    <React.StrictMode>
        <Router>
            <Routes>
                <Route path="/" element={<Navigate to="/overview" replace/>}/>
                <Route path="/overview" element={<OverviewPage/>}/>
            </Routes>
        </Router>
    </React.StrictMode>
); 